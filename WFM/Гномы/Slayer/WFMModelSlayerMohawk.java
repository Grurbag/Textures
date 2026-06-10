// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSlayerMohawk extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer mohawk;
	private final ModelRenderer mohawk_r1;
	private final ModelRenderer mohawk_r2;
	private final ModelRenderer mohawk_r3;
	private final ModelRenderer mohawk_r4;
	private final ModelRenderer mohawk_r5;
	private final ModelRenderer mohawk_r6;
	private final ModelRenderer mohawk_r7;
	private final ModelRenderer mohawk_r8;

	public WFMModelSlayerMohawk() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, 0.0F, 3.1416F, 0.0F);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);

		mohawk = new ModelRenderer(this);
		mohawk.setPos(0.0F, -7.0F, 0.0F);
		Head.addChild(mohawk);
		mohawk.texOffs(0, 21).addBox(0.0F, -13.0F, -12.0F, 0.0F, 21.0F, 22.0F, 0.0F, false);

		mohawk_r1 = new ModelRenderer(this);
		mohawk_r1.setPos(0.0F, 0.0F, 0.0F);
		mohawk.addChild(mohawk_r1);
		setRotationAngle(mohawk_r1, 0.0F, 0.0F, 0.1745F);
		mohawk_r1.texOffs(0, 21).addBox(0.0F, -13.0F, -12.0F, 0.0F, 21.0F, 22.0F, 0.0F, false);

		mohawk_r2 = new ModelRenderer(this);
		mohawk_r2.setPos(0.0F, 0.0F, 0.0F);
		mohawk.addChild(mohawk_r2);
		setRotationAngle(mohawk_r2, 0.0F, 0.0F, -0.1745F);
		mohawk_r2.texOffs(0, 21).addBox(0.0F, -13.0F, -12.0F, 0.0F, 21.0F, 22.0F, 0.0F, false);

		mohawk_r3 = new ModelRenderer(this);
		mohawk_r3.setPos(0.0F, 0.0F, 0.0F);
		mohawk.addChild(mohawk_r3);
		setRotationAngle(mohawk_r3, 0.0F, 0.0F, 0.1309F);
		mohawk_r3.texOffs(0, 21).addBox(0.0F, -13.0F, -12.0F, 0.0F, 21.0F, 22.0F, 0.0F, false);

		mohawk_r4 = new ModelRenderer(this);
		mohawk_r4.setPos(0.0F, 0.0F, 0.0F);
		mohawk.addChild(mohawk_r4);
		setRotationAngle(mohawk_r4, 0.0F, 0.0F, -0.1309F);
		mohawk_r4.texOffs(0, 21).addBox(0.0F, -13.0F, -12.0F, 0.0F, 21.0F, 22.0F, 0.0F, false);

		mohawk_r5 = new ModelRenderer(this);
		mohawk_r5.setPos(0.0F, 0.0F, 0.0F);
		mohawk.addChild(mohawk_r5);
		setRotationAngle(mohawk_r5, 0.0F, 0.0F, 0.0873F);
		mohawk_r5.texOffs(0, 21).addBox(0.0F, -13.0F, -12.0F, 0.0F, 21.0F, 22.0F, 0.0F, false);

		mohawk_r6 = new ModelRenderer(this);
		mohawk_r6.setPos(0.0F, 0.0F, 0.0F);
		mohawk.addChild(mohawk_r6);
		setRotationAngle(mohawk_r6, 0.0F, 0.0F, -0.0873F);
		mohawk_r6.texOffs(0, 21).addBox(0.0F, -13.0F, -12.0F, 0.0F, 21.0F, 22.0F, 0.0F, false);

		mohawk_r7 = new ModelRenderer(this);
		mohawk_r7.setPos(0.0F, 0.0F, 0.0F);
		mohawk.addChild(mohawk_r7);
		setRotationAngle(mohawk_r7, 0.0F, 0.0F, 0.0436F);
		mohawk_r7.texOffs(0, 21).addBox(0.0F, -13.0F, -12.0F, 0.0F, 21.0F, 22.0F, 0.0F, false);

		mohawk_r8 = new ModelRenderer(this);
		mohawk_r8.setPos(0.0F, 0.0F, 0.0F);
		mohawk.addChild(mohawk_r8);
		setRotationAngle(mohawk_r8, 0.0F, 0.0F, -0.0436F);
		mohawk_r8.texOffs(0, 21).addBox(0.0F, -13.0F, -12.0F, 0.0F, 21.0F, 22.0F, 0.0F, false);
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