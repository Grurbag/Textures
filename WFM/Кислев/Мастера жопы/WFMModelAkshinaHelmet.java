// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelAkshinaHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Head_r4;
	private final ModelRenderer Head_r5;
	private final ModelRenderer Head_r6;
	private final ModelRenderer Head_r7;
	private final ModelRenderer Head_r8;
	private final ModelRenderer Head_r9;
	private final ModelRenderer Head_r10;

	public WFMModelAkshinaHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.1F, false);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(0.0F, -14.0F, -2.25F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, -0.2182F, 0.0F, 0.0F);
		Head_r1.texOffs(36, 55).addBox(-3.0F, 2.0F, -5.75F, 6.0F, 5.0F, 4.0F, 0.0F, false);
		Head_r1.texOffs(0, 49).addBox(-5.0F, 0.0F, -1.75F, 10.0F, 7.0F, 8.0F, 0.0F, false);

		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(0.0F, -7.0F, 8.75F);
		Head.addChild(Head_r2);
		setRotationAngle(Head_r2, -0.1745F, 0.0F, 0.0F);
		Head_r2.texOffs(48, 8).addBox(-3.0F, 2.0F, -3.75F, 6.0F, 5.0F, 2.0F, 0.0F, false);

		Head_r3 = new ModelRenderer(this);
		Head_r3.setPos(0.0F, -14.0F, -2.25F);
		Head.addChild(Head_r3);
		setRotationAngle(Head_r3, -0.2164F, -0.0283F, -0.1278F);
		Head_r3.texOffs(2, 53).addBox(-6.0F, -3.0F, 3.25F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		Head_r4 = new ModelRenderer(this);
		Head_r4.setPos(0.0F, -14.0F, -2.25F);
		Head.addChild(Head_r4);
		setRotationAngle(Head_r4, -0.2164F, 0.0283F, 0.1278F);
		Head_r4.texOffs(2, 53).addBox(3.0F, -3.0F, 3.25F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		Head_r5 = new ModelRenderer(this);
		Head_r5.setPos(0.0F, -11.0F, 4.75F);
		Head.addChild(Head_r5);
		setRotationAngle(Head_r5, -1.0036F, 0.0F, 0.0F);
		Head_r5.texOffs(0, 34).addBox(-6.0F, 0.0F, -1.75F, 12.0F, 7.0F, 8.0F, 0.0F, false);

		Head_r6 = new ModelRenderer(this);
		Head_r6.setPos(-5.9F, -2.25F, -0.05F);
		Head.addChild(Head_r6);
		setRotationAngle(Head_r6, 0.0F, 0.0F, -0.0436F);
		Head_r6.texOffs(40, 18).addBox(-1.6F, -2.5F, -4.0F, 3.0F, 6.0F, 8.0F, -0.2F, true);

		Head_r7 = new ModelRenderer(this);
		Head_r7.setPos(-5.15F, -4.5F, -0.05F);
		Head.addChild(Head_r7);
		setRotationAngle(Head_r7, 0.0F, 0.0F, 0.1309F);
		Head_r7.texOffs(44, 34).addBox(-1.7F, -3.85F, -3.5F, 2.0F, 4.0F, 7.0F, 0.0F, true);

		Head_r8 = new ModelRenderer(this);
		Head_r8.setPos(5.15F, -4.5F, -0.05F);
		Head.addChild(Head_r8);
		setRotationAngle(Head_r8, 0.0F, 0.0F, -0.1309F);
		Head_r8.texOffs(44, 34).addBox(-0.3F, -3.85F, -3.5F, 2.0F, 4.0F, 7.0F, 0.0F, false);

		Head_r9 = new ModelRenderer(this);
		Head_r9.setPos(5.9F, -2.25F, -0.05F);
		Head.addChild(Head_r9);
		setRotationAngle(Head_r9, 0.0F, 0.0F, 0.0436F);
		Head_r9.texOffs(40, 18).addBox(-1.4F, -2.5F, -4.0F, 3.0F, 6.0F, 8.0F, -0.2F, false);

		Head_r10 = new ModelRenderer(this);
		Head_r10.setPos(0.0F, -9.1F, -0.25F);
		Head.addChild(Head_r10);
		setRotationAngle(Head_r10, -0.0873F, 0.0F, 0.0F);
		Head_r10.texOffs(0, 16).addBox(-4.0F, -1.0F, -4.5F, 8.0F, 2.0F, 9.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}