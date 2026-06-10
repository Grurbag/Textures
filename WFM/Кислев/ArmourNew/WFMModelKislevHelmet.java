// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKislevHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer head_r8;
	private final ModelRenderer head_r9;
	private final ModelRenderer head_r10;
	private final ModelRenderer head_r11;

	public WFMModelKislevHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(0, 36).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(-1.0F, -5.5F, -5.25F);
		Head.addChild(head_r1);
		setRotationAngle(head_r1, -0.1468F, -0.0257F, -0.1717F);
		head_r1.texOffs(26, 62).addBox(-2.0F, -1.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(0.0F, -5.5F, -7.25F);
		Head.addChild(head_r2);
		setRotationAngle(head_r2, -0.149F, 0.0001F, 0.0009F);
		head_r2.texOffs(27, 61).addBox(-1.0F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setPos(-1.0F, -8.5F, -5.25F);
		Head.addChild(head_r3);
		setRotationAngle(head_r3, -0.1468F, -0.0257F, -0.1717F);
		head_r3.texOffs(27, 62).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setPos(1.0F, -8.5F, -5.25F);
		Head.addChild(head_r4);
		setRotationAngle(head_r4, -0.1467F, 0.0259F, 0.1736F);
		head_r4.texOffs(27, 62).addBox(0.0F, -1.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setPos(0.0F, -6.5F, -5.25F);
		Head.addChild(head_r5);
		setRotationAngle(head_r5, -0.149F, 0.0001F, 0.0009F);
		head_r5.texOffs(26, 60).addBox(-1.5F, -2.5F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		head_r6 = new ModelRenderer(this);
		head_r6.setPos(1.0F, -5.5F, -5.25F);
		Head.addChild(head_r6);
		setRotationAngle(head_r6, -0.1467F, 0.0259F, 0.1736F);
		head_r6.texOffs(27, 62).addBox(0.0F, -1.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		head_r7 = new ModelRenderer(this);
		head_r7.setPos(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r7);
		setRotationAngle(head_r7, 0.0F, 0.0F, 0.0F);
		head_r7.texOffs(0, 22).addBox(-2.5F, -2.85F, -3.5F, 5.0F, 2.0F, 5.0F, -0.2F, false);

		head_r8 = new ModelRenderer(this);
		head_r8.setPos(0.0007F, -12.3258F, 5.5959F);
		Head.addChild(head_r8);
		setRotationAngle(head_r8, 0.0873F, 0.0F, 0.0F);
		head_r8.texOffs(52, 28).addBox(-1.5F, 0.5F, -1.0F, 3.0F, 4.0F, 3.0F, -0.3F, false);

		head_r9 = new ModelRenderer(this);
		head_r9.setPos(0.0007F, -15.5968F, 1.6515F);
		Head.addChild(head_r9);
		setRotationAngle(head_r9, 1.8762F, 0.0F, 0.0F);
		head_r9.texOffs(32, 16).addBox(-2.0F, -3.0F, -1.6F, 4.0F, 6.0F, 4.0F, -0.4F, false);

		head_r10 = new ModelRenderer(this);
		head_r10.setPos(0.0007F, -16.2229F, 3.3459F);
		Head.addChild(head_r10);
		setRotationAngle(head_r10, 0.5236F, 0.0F, 0.0F);
		head_r10.texOffs(48, 16).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, -0.2F, false);

		head_r11 = new ModelRenderer(this);
		head_r11.setPos(0.0007F, -12.2229F, 0.0459F);
		Head.addChild(head_r11);
		setRotationAngle(head_r11, 0.0F, 0.0F, 0.0F);
		head_r11.texOffs(24, 25).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, -0.2F, false);
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