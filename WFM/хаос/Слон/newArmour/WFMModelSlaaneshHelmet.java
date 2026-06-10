// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSlaaneshHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer petukh_r1;
	private final ModelRenderer petukh_r2;
	private final ModelRenderer petukh_r3;
	private final ModelRenderer petukh_r4;
	private final ModelRenderer petukh_r5;
	private final ModelRenderer petukh_r6;
	private final ModelRenderer petukh_r7;
	private final ModelRenderer petukh_r8;

	public WFMModelSlaaneshHelmet() {
		texWidth = 80;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(0, 16).addBox(-4.5F, -9.0F, -5.1F, 9.0F, 10.0F, 0.0F, 0.0F, false);
		Head.texOffs(0, 55).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		Head.texOffs(0, 42).addBox(-1.0F, -11.0F, -4.0F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		Head.texOffs(32, 29).addBox(0.0F, -20.0F, -4.0F, 0.0F, 19.0F, 16.0F, 0.0F, false);

		petukh_r1 = new ModelRenderer(this);
		petukh_r1.setPos(0.0F, -11.0F, -4.0F);
		Head.addChild(petukh_r1);
		setRotationAngle(petukh_r1, 0.0F, 0.0436F, 0.0F);
		petukh_r1.texOffs(32, 29).addBox(0.0F, -9.0F, 0.0F, 0.0F, 19.0F, 16.0F, 0.0F, false);

		petukh_r2 = new ModelRenderer(this);
		petukh_r2.setPos(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r2);
		setRotationAngle(petukh_r2, 0.0F, -0.0436F, 0.0F);
		petukh_r2.texOffs(32, 29).addBox(0.0F, -10.0F, 0.0F, 0.0F, 19.0F, 16.0F, 0.0F, false);

		petukh_r3 = new ModelRenderer(this);
		petukh_r3.setPos(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r3);
		setRotationAngle(petukh_r3, 0.0F, -0.1745F, 0.0F);
		petukh_r3.texOffs(32, 29).addBox(0.0F, -10.0F, 0.0F, 0.0F, 19.0F, 16.0F, 0.0F, false);

		petukh_r4 = new ModelRenderer(this);
		petukh_r4.setPos(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r4);
		setRotationAngle(petukh_r4, 0.0F, -0.1309F, 0.0F);
		petukh_r4.texOffs(32, 29).addBox(0.0F, -10.0F, 0.0F, 0.0F, 19.0F, 16.0F, 0.0F, false);

		petukh_r5 = new ModelRenderer(this);
		petukh_r5.setPos(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r5);
		setRotationAngle(petukh_r5, 0.0F, -0.0873F, 0.0F);
		petukh_r5.texOffs(32, 29).addBox(0.0F, -10.0F, 0.0F, 0.0F, 19.0F, 16.0F, 0.0F, false);

		petukh_r6 = new ModelRenderer(this);
		petukh_r6.setPos(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r6);
		setRotationAngle(petukh_r6, 0.0F, 0.1745F, 0.0F);
		petukh_r6.texOffs(32, 29).addBox(0.0F, -10.0F, 0.0F, 0.0F, 19.0F, 16.0F, 0.0F, false);

		petukh_r7 = new ModelRenderer(this);
		petukh_r7.setPos(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r7);
		setRotationAngle(petukh_r7, 0.0F, 0.1309F, 0.0F);
		petukh_r7.texOffs(32, 29).addBox(0.0F, -10.0F, 0.0F, 0.0F, 19.0F, 16.0F, 0.0F, false);

		petukh_r8 = new ModelRenderer(this);
		petukh_r8.setPos(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r8);
		setRotationAngle(petukh_r8, 0.0F, 0.0873F, 0.0F);
		petukh_r8.texOffs(32, 29).addBox(0.0F, -10.0F, 0.0F, 0.0F, 19.0F, 16.0F, 0.0F, false);
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