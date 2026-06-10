// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelCathayHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer head_r1;
	private final ModelRenderer tail;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer gem;

	public WFMModelCathayHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(0, 36).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.0F);
		head_r1.texOffs(0, 22).addBox(-2.5F, -2.85F, -3.5F, 5.0F, 2.0F, 5.0F, -0.2F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0007F, -11.3258F, 6.5959F);
		Head.addChild(tail);
		

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(0.0F, 0.0F, 1.0F);
		tail.addChild(head_r2);
		setRotationAngle(head_r2, 0.0873F, 0.0F, 0.0F);
		head_r2.texOffs(52, 40).addBox(-1.0007F, 4.5F, -1.5959F, 2.0F, 4.0F, 3.0F, -0.3F, false);
		head_r2.texOffs(50, 30).addBox(-1.5F, 1.5F, -2.0F, 3.0F, 4.0F, 4.0F, -0.3F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setPos(0.0F, -3.8971F, -1.25F);
		tail.addChild(head_r3);
		setRotationAngle(head_r3, 0.5236F, 0.0F, 0.0F);
		head_r3.texOffs(46, 16).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 9.0F, 5.0F, -0.2F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setPos(0.0F, -3.271F, -3.9445F);
		tail.addChild(head_r4);
		setRotationAngle(head_r4, 1.8762F, 0.0F, 0.0F);
		head_r4.texOffs(30, 16).addBox(-2.0F, -3.0F, -1.6F, 4.0F, 7.0F, 4.0F, -0.4F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setPos(0.0F, 0.1029F, -5.55F);
		tail.addChild(head_r5);
		setRotationAngle(head_r5, 0.0F, 0.0F, 0.0F);
		head_r5.texOffs(24, 25).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, -0.2F, false);

		gem = new ModelRenderer(this);
		gem.setPos(0.0F, -6.0F, -5.0F);
		Head.addChild(gem);
		gem.texOffs(0, 58).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 4.0F, 2.0F, -0.3F, false);
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